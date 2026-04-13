package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CellularData420: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CellularData420",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.503f, 10f)
            curveToRelative(0.246f, 0f, 0.45f, 0.177f, 0.492f, 0.41f)
            lineToRelative(0.008f, 0.09f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            curveToRelative(-0.245f, 0f, -0.45f, -0.177f, -0.492f, -0.41f)
            lineTo(7.003f, 15.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
            moveTo(4.5f, 12f)
            curveToRelative(0.245f, 0f, 0.45f, 0.177f, 0.492f, 0.41f)
            lineTo(5f, 12.5f)
            verticalLineToRelative(3f)
            curveTo(5f, 15.776f, 4.776f, 16f, 4.5f, 16f)
            curveToRelative(-0.245f, 0f, -0.45f, -0.177f, -0.492f, -0.41f)
            lineTo(4f, 15.5f)
            verticalLineToRelative(-3f)
            curveTo(4f, 12.224f, 4.224f, 12f, 4.5f, 12f)
            close()
        }
    }.build()
}
