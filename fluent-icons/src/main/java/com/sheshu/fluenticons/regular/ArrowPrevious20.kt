package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowPrevious20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowPrevious20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 5f)
            curveTo(5.755f, 5f, 5.55f, 5.177f, 5.508f, 5.41f)
            lineTo(5.5f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(5.5f, 14.776f, 5.724f, 15f, 6f, 15f)
            curveToRelative(0.245f, 0f, 0.45f, -0.177f, 0.492f, -0.41f)
            lineTo(6.5f, 14.5f)
            verticalLineToRelative(-9f)
            curveTo(6.5f, 5.224f, 6.276f, 5f, 6f, 5f)
            close()
            moveToRelative(7.854f, 0.146f)
            curveTo(13.68f, 4.973f, 13.41f, 4.954f, 13.216f, 5.09f)
            lineToRelative(-0.07f, 0.057f)
            lineToRelative(-4.5f, 4.5f)
            curveTo(8.473f, 9.82f, 8.454f, 10.09f, 8.59f, 10.284f)
            lineToRelative(0.057f, 0.07f)
            lineToRelative(4.5f, 4.5f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.173f, -0.174f, 0.192f, -0.443f, 0.057f, -0.638f)
            lineToRelative(-0.057f, -0.07f)
            lineTo(9.707f, 10f)
            lineToRelative(4.147f, -4.146f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            close()
        }
    }.build()
}
