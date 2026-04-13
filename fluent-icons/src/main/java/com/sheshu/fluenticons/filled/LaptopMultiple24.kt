package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LaptopMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LaptopMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.627f, 5f)
            horizontalLineToRelative(10.622f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            verticalLineToRelative(6.622f)
            curveToRelative(0.874f, -0.31f, 1.5f, -1.143f, 1.5f, -2.122f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -2.347f, -1.903f, -4.25f, -4.25f, -4.25f)
            horizontalLineToRelative(-8.5f)
            curveToRelative(-0.98f, 0f, -1.813f, 0.626f, -2.122f, 1.5f)
            close()
            moveTo(6.25f, 6f)
            curveTo(5.007f, 6f, 4f, 7.007f, 4f, 8.25f)
            verticalLineToRelative(6.5f)
            curveTo(4f, 15.993f, 5.007f, 17f, 6.25f, 17f)
            horizontalLineToRelative(10.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-6.5f)
            curveTo(19f, 7.007f, 17.993f, 6f, 16.75f, 6f)
            horizontalLineTo(6.25f)
            close()
            moveToRelative(-3.5f, 12.5f)
            curveTo(2.336f, 18.5f, 2f, 18.836f, 2f, 19.25f)
            reflectiveCurveTo(2.336f, 20f, 2.75f, 20f)
            horizontalLineToRelative(17.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(2.75f)
            close()
        }
    }.build()
}
