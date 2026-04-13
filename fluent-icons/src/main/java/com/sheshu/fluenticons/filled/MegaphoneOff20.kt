package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MegaphoneOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MegaphoneOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(3.335f, 3.334f)
            lineToRelative(-2.367f, 0.63f)
            curveTo(2.457f, 6.995f, 2f, 7.589f, 2f, 8.269f)
            verticalLineToRelative(2.511f)
            curveToRelative(0f, 0.646f, 0.413f, 1.22f, 1.026f, 1.423f)
            lineTo(5f, 12.86f)
            verticalLineToRelative(0.89f)
            curveTo(5f, 15.545f, 6.455f, 17f, 8.25f, 17f)
            curveToRelative(1.371f, 0f, 2.543f, -0.849f, 3.02f, -2.05f)
            lineToRelative(4.46f, 1.487f)
            lineToRelative(1.416f, 1.417f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            close()
            moveTo(6f, 13.194f)
            lineToRelative(4.32f, 1.44f)
            curveTo(9.977f, 15.437f, 9.179f, 16f, 8.25f, 16f)
            curveTo(7.007f, 16f, 6f, 14.993f, 6f, 13.75f)
            verticalLineToRelative(-0.556f)
            close()
            moveToRelative(12f, 1.919f)
            curveToRelative(0f, 0.227f, -0.05f, 0.44f, -0.137f, 0.629f)
            lineTo(7.713f, 5.592f)
            lineToRelative(8.4f, -2.24f)
            curveTo(17.066f, 3.098f, 18f, 3.816f, 18f, 4.802f)
            verticalLineToRelative(10.31f)
            close()
        }
    }.build()
}
