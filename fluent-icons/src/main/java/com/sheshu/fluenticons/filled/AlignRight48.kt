package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignRight48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignRight48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(41.5f, 5.25f)
            curveTo(41.5f, 4.56f, 40.94f, 4f, 40.25f, 4f)
            reflectiveCurveTo(39f, 4.56f, 39f, 5.25f)
            verticalLineToRelative(37.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(5.25f)
            close()
            moveTo(32.25f, 26f)
            curveToRelative(2.347f, 0f, 4.25f, 1.903f, 4.25f, 4.25f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineToRelative(-15f)
            curveTo(14.903f, 40f, 13f, 38.097f, 13f, 35.75f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -2.347f, 1.903f, -4.25f, 4.25f, -4.25f)
            horizontalLineToRelative(15f)
            close()
            moveToRelative(4.25f, -13.75f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineTo(10f)
            curveToRelative(-2.347f, 0f, -4.25f, -1.903f, -4.25f, -4.25f)
            verticalLineToRelative(-5.5f)
            curveTo(5.75f, 9.903f, 7.653f, 8f, 10f, 8f)
            horizontalLineToRelative(22.25f)
            curveToRelative(2.347f, 0f, 4.25f, 1.903f, 4.25f, 4.25f)
            close()
        }
    }.build()
}
