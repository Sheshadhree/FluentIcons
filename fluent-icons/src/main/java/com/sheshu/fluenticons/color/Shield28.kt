package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Shield28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Shield28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.337728f to Color(0xFF0FAFFF),
                    0.529425f to Color(0xFF367AF2),
                    0.682436f to Color(0xFF5750E2),
                    0.860903f to Color(0xFFCC23D1)
                ),
                center = Offset(-5.64193f, -11.4989f),
                radius = 57.4728f
            )
        ) {
            moveTo(13.56f, 2.142f)
            curveToRelative(0.262f, -0.19f, 0.616f, -0.19f, 0.878f, 0f)
            curveToRelative(0.643f, 0.464f, 2.088f, 1.312f, 3.897f, 2.041f)
            curveToRelative(1.81f, 0.73f, 3.922f, 1.317f, 5.913f, 1.317f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(7.752f)
            curveToRelative(0f, 3.027f, -1.703f, 5.841f, -3.838f, 7.95f)
            curveToRelative(-2.133f, 2.107f, -4.827f, 3.64f, -7.033f, 4.024f)
            lineTo(14f, 25.998f)
            lineToRelative(-0.129f, -0.022f)
            curveToRelative(-2.205f, -0.385f, -4.9f, -1.917f, -7.033f, -4.024f)
            curveTo(4.703f, 19.843f, 3f, 17.029f, 3f, 14.002f)
            verticalLineTo(6.25f)
            curveTo(3f, 5.836f, 3.336f, 5.5f, 3.75f, 5.5f)
            curveToRelative(1.991f, 0f, 4.103f, -0.587f, 5.914f, -1.317f)
            curveToRelative(1.808f, -0.73f, 3.253f, -1.576f, 3.896f, -2.04f)
            close()
        }
    }.build()
}
