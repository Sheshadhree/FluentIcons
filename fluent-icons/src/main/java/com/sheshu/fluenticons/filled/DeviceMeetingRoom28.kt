package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DeviceMeetingRoom28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DeviceMeetingRoom28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.972f, 5.58f)
            curveTo(5.387f, 4.055f, 6.77f, 3f, 8.349f, 3f)
            horizontalLineToRelative(11.302f)
            curveToRelative(1.579f, 0f, 2.962f, 1.056f, 3.377f, 2.58f)
            lineToRelative(2.829f, 10.367f)
            curveTo(26.55f, 18.492f, 24.635f, 21f, 21.997f, 21f)
            horizontalLineTo(6.003f)
            curveToRelative(-2.638f, 0f, -4.554f, -2.508f, -3.86f, -5.053f)
            lineTo(4.972f, 5.58f)
            close()
            moveTo(7.748f, 22.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(7.334f, 24f, 7.748f, 24f)
            horizontalLineToRelative(12.503f)
            curveToRelative(0.415f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.335f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(7.748f)
            close()
        }
    }.build()
}
