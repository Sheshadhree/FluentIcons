package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpload20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpload20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 3.002f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            curveToRelative(0f, -0.245f, -0.177f, -0.45f, -0.41f, -0.492f)
            lineTo(15f, 2.002f)
            horizontalLineTo(4f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            curveToRelative(0f, 0.245f, 0.177f, 0.45f, 0.41f, 0.492f)
            lineTo(4f, 3.002f)
            horizontalLineToRelative(11f)
            close()
            moveTo(9.5f, 18f)
            curveToRelative(0.246f, 0f, 0.45f, -0.177f, 0.492f, -0.41f)
            lineTo(10f, 17.5f)
            lineTo(9.996f, 5.706f)
            lineToRelative(3.645f, 3.648f)
            curveToRelative(0.174f, 0.174f, 0.443f, 0.193f, 0.638f, 0.059f)
            lineToRelative(0.07f, -0.058f)
            curveToRelative(0.173f, -0.174f, 0.193f, -0.443f, 0.058f, -0.638f)
            lineToRelative(-0.058f, -0.07f)
            lineToRelative(-4.492f, -4.5f)
            curveTo(9.785f, 4.076f, 9.696f, 4.03f, 9.602f, 4.012f)
            lineTo(9.496f, 4f)
            curveTo(9.336f, 4f, 9.192f, 4.077f, 9.1f, 4.195f)
            lineTo(4.644f, 8.647f)
            curveToRelative(-0.196f, 0.195f, -0.196f, 0.512f, 0f, 0.707f)
            curveToRelative(0.173f, 0.174f, 0.442f, 0.193f, 0.637f, 0.059f)
            lineToRelative(0.07f, -0.058f)
            lineToRelative(3.645f, -3.641f)
            lineTo(9f, 17.5f)
            curveTo(9f, 17.776f, 9.224f, 18f, 9.5f, 18f)
            close()
        }
    }.build()
}
