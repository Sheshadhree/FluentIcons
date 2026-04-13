package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudOff32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudOff32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.573f, 24.987f)
            lineToRelative(4.72f, 4.72f)
            curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0f, -1.414f)
            lineToRelative(-26f, -26f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(6.575f, 6.575f)
            curveToRelative(-0.44f, 0.901f, -0.703f, 1.854f, -0.81f, 2.765f)
            curveTo(3.93f, 13.47f, 2f, 16.644f, 2f, 19f)
            curveToRelative(0f, 1.145f, 0.284f, 2.664f, 1.373f, 3.908f)
            curveTo(4.485f, 24.18f, 6.293f, 25f, 9f, 25f)
            horizontalLineToRelative(14f)
            curveToRelative(0.194f, 0f, 0.385f, -0.005f, 0.573f, -0.013f)
            close()
            moveToRelative(4.583f, -1.589f)
            curveToRelative(-0.218f, 0.19f, -0.453f, 0.363f, -0.704f, 0.519f)
            lineTo(11.084f, 7.549f)
            curveTo(12.329f, 6.6f, 13.962f, 5.999f, 16f, 5.999f)
            curveToRelative(1.7f, 0f, 3.682f, 0.562f, 5.259f, 1.852f)
            curveToRelative(1.42f, 1.162f, 2.472f, 2.887f, 2.697f, 5.206f)
            curveToRelative(1.377f, 0.165f, 2.713f, 0.683f, 3.78f, 1.507f)
            curveTo(29.063f, 15.59f, 30f, 17.114f, 30f, 19f)
            curveToRelative(0f, 1.753f, -0.583f, 3.303f, -1.844f, 4.398f)
            close()
        }
    }.build()
}
