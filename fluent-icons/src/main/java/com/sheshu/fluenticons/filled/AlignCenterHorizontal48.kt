package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignCenterHorizontal48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignCenterHorizontal48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(44f, 24.25f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(40f)
            verticalLineToRelative(6.25f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineToRelative(-5.5f)
            curveTo(27.903f, 36f, 26f, 34.097f, 26f, 31.75f)
            verticalLineTo(25.5f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(10.25f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineToRelative(-5.5f)
            curveTo(9.903f, 40f, 8f, 38.097f, 8f, 35.75f)
            verticalLineTo(25.5f)
            horizontalLineTo(5.25f)
            curveTo(4.56f, 25.5f, 4f, 24.94f, 4f, 24.25f)
            reflectiveCurveTo(4.56f, 23f, 5.25f, 23f)
            horizontalLineTo(8f)
            verticalLineTo(12.25f)
            curveTo(8f, 9.903f, 9.903f, 8f, 12.25f, 8f)
            horizontalLineToRelative(5.5f)
            curveTo(20.097f, 8f, 22f, 9.903f, 22f, 12.25f)
            verticalLineTo(23f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-6.75f)
            curveToRelative(0f, -2.347f, 1.903f, -4.25f, 4.25f, -4.25f)
            horizontalLineToRelative(5.5f)
            curveToRelative(2.347f, 0f, 4.25f, 1.903f, 4.25f, 4.25f)
            verticalLineTo(23f)
            horizontalLineToRelative(2.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            close()
        }
    }.build()
}
