package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneFooterArrowDown24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneFooterArrowDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 4.25f)
            curveTo(18f, 3.007f, 16.993f, 2f, 15.75f, 2f)
            horizontalLineToRelative(-7.5f)
            curveTo(7.007f, 2f, 6f, 3.007f, 6f, 4.25f)
            verticalLineToRelative(15.5f)
            curveTo(6f, 20.993f, 7.007f, 22f, 8.25f, 22f)
            horizontalLineToRelative(7.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(4.25f)
            close()
            moveToRelative(-9.5f, 14f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(5.5f)
            lineToRelative(0.102f, 0.007f)
            curveToRelative(0.366f, 0.05f, 0.648f, 0.363f, 0.648f, 0.743f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-5.5f)
            lineToRelative(-0.102f, -0.007f)
            curveTo(8.782f, 18.943f, 8.5f, 18.63f, 8.5f, 18.25f)
            close()
            moveTo(11.993f, 16f)
            curveToRelative(-0.199f, -0.002f, -0.389f, -0.083f, -0.528f, -0.225f)
            lineToRelative(-2.45f, -2.5f)
            curveToRelative(-0.29f, -0.296f, -0.285f, -0.77f, 0.01f, -1.06f)
            curveToRelative(0.297f, -0.29f, 0.771f, -0.286f, 1.061f, 0.01f)
            lineToRelative(1.164f, 1.187f)
            verticalLineTo(9.75f)
            curveTo(11.25f, 9.336f, 11.586f, 9f, 12f, 9f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(3.715f)
            lineToRelative(1.275f, -1.25f)
            curveToRelative(0.296f, -0.29f, 0.77f, -0.286f, 1.06f, 0.01f)
            curveToRelative(0.29f, 0.296f, 0.286f, 0.77f, -0.01f, 1.06f)
            lineToRelative(-2.55f, 2.5f)
            curveToRelative(-0.141f, 0.14f, -0.333f, 0.217f, -0.532f, 0.215f)
            close()
        }
    }.build()
}
