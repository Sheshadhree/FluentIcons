package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDownLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDownLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 16f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(11.776f, 17f, 11.5f, 17f)
            horizontalLineToRelative(-8f)
            curveTo(3.224f, 17f, 3f, 16.776f, 3f, 16.5f)
            verticalLineToRelative(-8f)
            curveTo(3f, 8.224f, 3.224f, 8f, 3.5f, 8f)
            reflectiveCurveTo(4f, 8.224f, 4f, 8.5f)
            verticalLineToRelative(6.793f)
            lineTo(16.146f, 3.147f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineTo(4.707f, 16f)
            horizontalLineTo(11.5f)
            close()
        }
    }.build()
}
