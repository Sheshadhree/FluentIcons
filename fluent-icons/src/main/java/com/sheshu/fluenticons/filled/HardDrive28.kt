package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HardDrive28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HardDrive28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.527f, 6.442f)
            curveTo(7.007f, 5.554f, 7.937f, 5f, 8.947f, 5f)
            horizontalLineToRelative(10.111f)
            curveToRelative(1.01f, 0f, 1.939f, 0.554f, 2.42f, 1.442f)
            lineToRelative(3.463f, 6.408f)
            curveToRelative(-0.518f, -0.225f, -1.09f, -0.35f, -1.691f, -0.35f)
            horizontalLineTo(4.75f)
            curveToRelative(-0.599f, 0f, -1.168f, 0.124f, -1.685f, 0.347f)
            lineToRelative(3.462f, -6.405f)
            close()
            moveTo(23.25f, 23f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -1.519f, -1.231f, -2.75f, -2.75f, -2.75f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 14f, 2f, 15.231f, 2f, 16.75f)
            verticalLineToRelative(3.5f)
            curveTo(2f, 21.769f, 3.231f, 23f, 4.75f, 23f)
            horizontalLineToRelative(18.5f)
            close()
            moveToRelative(-3f, -4.5f)
            curveToRelative(0f, -0.686f, 0.553f, -1.243f, 1.238f, -1.25f)
            horizontalLineToRelative(0.024f)
            curveToRelative(0.685f, 0.007f, 1.238f, 0.564f, 1.238f, 1.25f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            close()
        }
    }.build()
}
