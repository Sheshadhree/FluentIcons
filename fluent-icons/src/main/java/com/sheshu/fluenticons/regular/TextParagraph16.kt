package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextParagraph16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextParagraph16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 2f)
            curveTo(13.224f, 2f, 13f, 2.224f, 13f, 2.5f)
            verticalLineTo(5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(8.707f)
            lineToRelative(1.146f, -1.146f)
            curveToRelative(0.196f, -0.196f, 0.196f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.195f, -0.195f, -0.511f, -0.195f, -0.707f, 0f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2f, 2f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            curveToRelative(0.196f, -0.196f, 0.196f, -0.512f, 0f, -0.707f)
            lineTo(8.707f, 7f)
            horizontalLineTo(12f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(2.5f)
            curveTo(14f, 2.224f, 13.776f, 2f, 13.5f, 2f)
            close()
            moveTo(5.646f, 8.146f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(6.793f, 11f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 11f, 1f, 10.776f, 1f, 10.5f)
            reflectiveCurveTo(1.224f, 10f, 1.5f, 10f)
            horizontalLineToRelative(5.293f)
            lineTo(5.646f, 8.854f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            close()
        }
    }.build()
}
