package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextParagraphDirectionLeft16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextParagraphDirectionLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 3f)
            curveTo(7.62f, 3f, 6.5f, 4.12f, 6.5f, 5.5f)
            reflectiveCurveTo(7.62f, 8f, 9f, 8f)
            horizontalLineToRelative(1f)
            verticalLineTo(3f)
            horizontalLineTo(9f)
            close()
            moveToRelative(2f, 0f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(10f, 13.776f, 10f, 13.5f)
            verticalLineTo(9f)
            horizontalLineTo(9f)
            curveTo(7.067f, 9f, 5.5f, 7.433f, 5.5f, 5.5f)
            reflectiveCurveTo(7.067f, 2f, 9f, 2f)
            horizontalLineToRelative(4.5f)
            curveTo(13.776f, 2f, 14f, 2.224f, 14f, 2.5f)
            reflectiveCurveTo(13.776f, 3f, 13.5f, 3f)
            horizontalLineTo(13f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(12f, 13.776f, 12f, 13.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(-1f)
            close()
            moveTo(3.854f, 6.146f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineTo(2.707f, 8f)
            lineToRelative(1.147f, 1.146f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(-0.196f, 0.196f, -0.512f, 0.196f, -0.708f, 0f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(1.5f, -1.5f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            close()
        }
    }.build()
}
