package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Broom16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Broom16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.854f, 1.147f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.706f)
            lineToRelative(-3.958f, 3.958f)
            curveTo(10.792f, 5.683f, 10.68f, 5.56f, 10.56f, 5.44f)
            curveToRelative(-0.12f, -0.12f, -0.244f, -0.231f, -0.373f, -0.335f)
            lineToRelative(3.958f, -3.958f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            close()
            moveTo(4.653f, 6.19f)
            lineTo(4.262f, 6.555f)
            lineToRelative(5.195f, 5.195f)
            lineToRelative(0.396f, -0.396f)
            curveToRelative(1.445f, -1.445f, 1.445f, -3.762f, 0f, -5.207f)
            curveTo(8.4f, 4.692f, 6.088f, 4.761f, 4.653f, 6.19f)
            close()
            moveToRelative(-3.36f, 1.855f)
            lineToRelative(2.093f, -0.952f)
            lineToRelative(5.52f, 5.52f)
            lineToRelative(-0.95f, 2.094f)
            curveToRelative(-0.069f, 0.15f, -0.205f, 0.256f, -0.367f, 0.285f)
            curveToRelative(-0.161f, 0.03f, -0.327f, -0.023f, -0.443f, -0.139f)
            lineToRelative(-6f, -6f)
            curveTo(1.031f, 8.739f, 0.98f, 8.574f, 1.008f, 8.412f)
            curveToRelative(0.03f, -0.162f, 0.136f, -0.298f, 0.285f, -0.366f)
            close()
        }
    }.build()
}
