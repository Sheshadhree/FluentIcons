package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.147f, 1.147f)
            curveToRelative(0.195f, -0.196f, 0.511f, -0.196f, 0.706f, 0f)
            lineToRelative(13f, 13f)
            curveToRelative(0.196f, 0.195f, 0.196f, 0.511f, 0f, 0.707f)
            curveToRelative(-0.195f, 0.195f, -0.511f, 0.195f, -0.707f, 0f)
            lineToRelative(-2.657f, -2.658f)
            curveToRelative(-0.81f, 0.946f, -1.67f, 1.764f, -2.334f, 2.348f)
            curveToRelative(-0.667f, 0.587f, -1.643f, 0.587f, -2.31f, 0f)
            curveTo(5.1f, 13.009f, 2f, 9.876f, 2f, 7f)
            curveToRelative(0f, -1.22f, 0.365f, -2.355f, 0.991f, -3.302f)
            lineTo(1.146f, 1.853f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.706f)
            close()
            moveTo(8f, 1f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            curveToRelative(0f, 1.196f, -0.538f, 2.437f, -1.29f, 3.589f)
            lineTo(9.857f, 7.736f)
            curveTo(9.947f, 7.508f, 10f, 7.26f, 10f, 7f)
            curveToRelative(0f, -1.104f, -0.895f, -2f, -2f, -2f)
            curveToRelative(-0.26f, 0f, -0.509f, 0.051f, -0.737f, 0.142f)
            lineTo(4.356f, 2.234f)
            curveTo(5.365f, 1.46f, 6.629f, 1f, 8f, 1f)
            close()
            moveTo(6.02f, 6.728f)
            curveTo(6.009f, 6.817f, 6f, 6.907f, 6f, 7f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            curveToRelative(0.092f, 0f, 0.183f, -0.01f, 0.271f, -0.021f)
            lineToRelative(-2.25f, -2.251f)
            close()
        }
    }.build()
}
