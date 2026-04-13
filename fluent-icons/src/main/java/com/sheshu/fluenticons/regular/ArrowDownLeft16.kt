package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDownLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDownLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 13f)
            curveTo(8.776f, 13f, 9f, 13.224f, 9f, 13.5f)
            reflectiveCurveTo(8.776f, 14f, 8.5f, 14f)
            horizontalLineToRelative(-6f)
            curveTo(2.224f, 14f, 2f, 13.776f, 2f, 13.5f)
            verticalLineToRelative(-6f)
            curveTo(2f, 7.224f, 2.224f, 7f, 2.5f, 7f)
            reflectiveCurveTo(3f, 7.224f, 3f, 7.5f)
            verticalLineToRelative(4.793f)
            lineTo(13.146f, 2.147f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineTo(3.707f, 13f)
            horizontalLineTo(8.5f)
            close()
        }
    }.build()
}
