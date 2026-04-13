package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowClockwise24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowClockwise24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 4.5f)
            curveToRelative(-4.142f, 0f, -7.5f, 3.358f, -7.5f, 7.5f)
            curveToRelative(0f, 4.142f, 3.358f, 7.5f, 7.5f, 7.5f)
            curveToRelative(4.142f, 0f, 7.5f, -3.358f, 7.5f, -7.5f)
            curveToRelative(0f, -0.376f, -0.028f, -0.746f, -0.081f, -1.108f)
            curveTo(19.352f, 10.438f, 19.684f, 10f, 20.143f, 10f)
            curveToRelative(0.37f, 0f, 0.696f, 0.256f, 0.752f, 0.623f)
            curveTo(20.965f, 11.072f, 21f, 11.532f, 21f, 12f)
            curveToRelative(0f, 4.97f, -4.03f, 9f, -9f, 9f)
            reflectiveCurveToRelative(-9f, -4.03f, -9f, -9f)
            reflectiveCurveToRelative(4.03f, -9f, 9f, -9f)
            curveToRelative(2.305f, 0f, 4.408f, 0.867f, 6f, 2.292f)
            verticalLineTo(4.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(3f)
            curveTo(19.5f, 7.664f, 19.164f, 8f, 18.75f, 8f)
            horizontalLineToRelative(-3f)
            curveTo(15.336f, 8f, 15f, 7.664f, 15f, 7.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(1.35f)
            curveToRelative(-1.34f, -1.241f, -3.13f, -2f, -5.1f, -2f)
            close()
        }
    }.build()
}
