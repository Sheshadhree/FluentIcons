package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WeatherMoon16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WeatherMoon16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.456f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            curveToRelative(-2.381f, 0f, -4.437f, -1.387f, -5.406f, -3.395f)
            curveToRelative(-0.068f, -0.141f, -0.066f, -0.305f, 0.004f, -0.444f)
            curveToRelative(0.071f, -0.14f, 0.203f, -0.238f, 0.357f, -0.266f)
            curveToRelative(1.275f, -0.231f, 3.277f, -0.937f, 4.077f, -3.07f)
            curveTo(7.051f, 5.324f, 7f, 3.81f, 6.771f, 2.594f)
            curveToRelative(-0.026f, -0.142f, 0.01f, -0.29f, 0.101f, -0.404f)
            curveTo(6.964f, 2.077f, 7.1f, 2.009f, 7.246f, 2.004f)
            curveTo(7.316f, 2f, 7.386f, 2f, 7.456f, 2f)
            close()
        }
    }.build()
}
