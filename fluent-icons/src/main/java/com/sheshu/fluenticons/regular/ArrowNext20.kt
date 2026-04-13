package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowNext20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowNext20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 5f)
            curveToRelative(0.245f, 0f, 0.45f, 0.177f, 0.492f, 0.41f)
            lineTo(14f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            curveToRelative(-0.245f, 0f, -0.45f, -0.177f, -0.492f, -0.41f)
            lineTo(13f, 14.5f)
            verticalLineToRelative(-9f)
            curveTo(13f, 5.224f, 13.224f, 5f, 13.5f, 5f)
            close()
            moveTo(5.646f, 5.146f)
            curveTo(5.82f, 4.973f, 6.09f, 4.954f, 6.284f, 5.09f)
            lineToRelative(0.07f, 0.057f)
            lineToRelative(4.5f, 4.5f)
            curveToRelative(0.173f, 0.174f, 0.192f, 0.443f, 0.057f, 0.638f)
            lineToRelative(-0.057f, 0.07f)
            lineToRelative(-4.5f, 4.5f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.173f, -0.174f, -0.192f, -0.443f, -0.057f, -0.638f)
            lineToRelative(0.057f, -0.07f)
            lineTo(9.793f, 10f)
            lineTo(5.647f, 5.854f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            close()
        }
    }.build()
}
