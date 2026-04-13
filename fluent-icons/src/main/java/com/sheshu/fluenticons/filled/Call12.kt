package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Call12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Call12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.966f, 4.49f)
            lineTo(5.14f, 5.232f)
            curveToRelative(0.016f, 0.056f, 0.036f, 0.12f, 0.06f, 0.193f)
            curveToRelative(0.082f, 0.245f, 0.21f, 0.566f, 0.395f, 0.88f)
            curveTo(5.78f, 6.618f, 6f, 6.887f, 6.176f, 7.079f)
            curveToRelative(0.052f, 0.057f, 0.1f, 0.106f, 0.14f, 0.148f)
            lineToRelative(1.071f, -0.33f)
            curveToRelative(0.6f, -0.184f, 1.255f, 0.005f, 1.654f, 0.48f)
            lineToRelative(0.61f, 0.726f)
            curveToRelative(0.514f, 0.61f, 0.454f, 1.504f, -0.137f, 2.042f)
            curveToRelative(-0.995f, 0.908f, -2.527f, 1.215f, -3.674f, 0.314f)
            curveToRelative(-0.798f, -0.627f, -1.735f, -1.557f, -2.516f, -2.87f)
            curveToRelative(-0.784f, -1.32f, -1.14f, -2.582f, -1.294f, -3.575f)
            curveToRelative(-0.22f, -1.422f, 0.821f, -2.56f, 2.119f, -2.948f)
            curveToRelative(0.774f, -0.232f, 1.6f, 0.166f, 1.884f, 0.908f)
            lineToRelative(0.335f, 0.875f)
            curveTo(6.588f, 3.425f, 6.43f, 4.074f, 5.966f, 4.49f)
            close()
        }
    }.build()
}
