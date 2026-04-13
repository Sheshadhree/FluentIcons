package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDownLeft12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDownLeft12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.854f, 1.147f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.706f)
            lineTo(2.707f, 10f)
            horizontalLineTo(7.53f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(7.806f, 11f, 7.53f, 11f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 11f, 1f, 10.776f, 1f, 10.5f)
            verticalLineToRelative(-6f)
            curveTo(1f, 4.224f, 1.224f, 4f, 1.5f, 4f)
            reflectiveCurveTo(2f, 4.224f, 2f, 4.5f)
            verticalLineToRelative(4.793f)
            lineToRelative(8.146f, -8.146f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            close()
        }
    }.build()
}
