package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTurnUpDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTurnUpDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.447f, 16.53f)
            curveToRelative(-0.078f, 0.194f, -0.233f, 0.347f, -0.43f, 0.422f)
            curveToRelative(-0.195f, 0.074f, -0.414f, 0.063f, -0.601f, -0.03f)
            lineToRelative(-5.001f, -2.5f)
            curveToRelative(-0.37f, -0.186f, -0.521f, -0.636f, -0.336f, -1.007f)
            curveToRelative(0.185f, -0.37f, 0.636f, -0.52f, 1.006f, -0.335f)
            lineToRelative(3.245f, 1.62f)
            lineToRelative(-4.32f, -9.818f)
            lineToRelative(-4.57f, 10.663f)
            curveToRelative(-0.163f, 0.38f, -0.604f, 0.557f, -0.984f, 0.394f)
            curveToRelative(-0.381f, -0.163f, -0.557f, -0.604f, -0.394f, -0.985f)
            lineToRelative(4.795f, -11.19f)
            curveToRelative(0.43f, -1.005f, 1.853f, -1.012f, 2.293f, -0.012f)
            lineToRelative(4.606f, 10.467f)
            lineToRelative(1.298f, -3.247f)
            curveToRelative(0.153f, -0.384f, 0.59f, -0.572f, 0.974f, -0.418f)
            curveToRelative(0.385f, 0.154f, 0.572f, 0.59f, 0.418f, 0.975f)
            lineToRelative(-1.999f, 5f)
            close()
        }
    }.build()
}
