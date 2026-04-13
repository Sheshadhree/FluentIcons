package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignBottom48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignBottom48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 41.5f)
            curveTo(4.56f, 41.5f, 4f, 40.94f, 4f, 40.25f)
            reflectiveCurveTo(4.56f, 39f, 5.25f, 39f)
            horizontalLineToRelative(37.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(5.25f)
            close()
            moveTo(26f, 32.25f)
            curveToRelative(0f, 2.347f, 1.903f, 4.25f, 4.25f, 4.25f)
            horizontalLineToRelative(5.5f)
            curveToRelative(2.347f, 0f, 4.25f, -1.903f, 4.25f, -4.25f)
            verticalLineToRelative(-15f)
            curveToRelative(0f, -2.347f, -1.903f, -4.25f, -4.25f, -4.25f)
            horizontalLineToRelative(-5.5f)
            curveTo(27.903f, 13f, 26f, 14.903f, 26f, 17.25f)
            verticalLineToRelative(15f)
            close()
            moveTo(12.25f, 36.5f)
            horizontalLineToRelative(5.5f)
            curveToRelative(2.347f, 0f, 4.25f, -1.903f, 4.25f, -4.25f)
            verticalLineTo(10f)
            curveToRelative(0f, -2.347f, -1.903f, -4.25f, -4.25f, -4.25f)
            horizontalLineToRelative(-5.5f)
            curveTo(9.903f, 5.75f, 8f, 7.653f, 8f, 10f)
            verticalLineToRelative(22.25f)
            curveToRelative(0f, 2.347f, 1.903f, 4.25f, 4.25f, 4.25f)
            close()
        }
    }.build()
}
