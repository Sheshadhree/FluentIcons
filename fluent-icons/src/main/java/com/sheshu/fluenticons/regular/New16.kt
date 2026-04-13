package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.New16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.New16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.502f, 11f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            curveToRelative(0f, 0.245f, -0.177f, 0.45f, -0.41f, 0.492f)
            lineTo(8.502f, 12f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.277f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            curveToRelative(0f, -0.245f, 0.177f, -0.45f, 0.41f, -0.492f)
            lineTo(3.502f, 11f)
            horizontalLineToRelative(5f)
            horizontalLineToRelative(-5f)
            close()
            moveToRelative(1.646f, -5.854f)
            curveTo(5.322f, 4.973f, 5.591f, 4.954f, 5.786f, 5.09f)
            lineToRelative(0.07f, 0.057f)
            lineToRelative(3.998f, 4f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveTo(9.68f, 10.027f, 9.41f, 10.046f, 9.216f, 9.91f)
            lineToRelative(-0.07f, -0.057f)
            lineToRelative(-3.998f, -4f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            close()
            moveTo(11.502f, 3f)
            curveToRelative(0.245f, 0f, 0.45f, 0.177f, 0.491f, 0.41f)
            lineToRelative(0.009f, 0.09f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            curveToRelative(-0.246f, 0f, -0.45f, -0.177f, -0.492f, -0.41f)
            lineTo(11.002f, 8.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.276f, 0.223f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
