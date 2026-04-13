package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowExportLtr16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowExportLtr16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.5f, 3f)
            curveTo(1.776f, 3f, 2f, 3.224f, 2f, 3.5f)
            verticalLineTo(12f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(1f, 12.276f, 1f, 12f)
            verticalLineTo(3.5f)
            curveTo(1f, 3.224f, 1.224f, 3f, 1.5f, 3f)
            close()
            moveToRelative(9.146f, 0.647f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(-3.5f, 3.5f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(13.293f, 8f)
            horizontalLineTo(4.5f)
            curveTo(4.224f, 8f, 4f, 7.776f, 4f, 7.5f)
            reflectiveCurveTo(4.224f, 7f, 4.5f, 7f)
            horizontalLineToRelative(8.793f)
            lineToRelative(-2.647f, -2.646f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            close()
        }
    }.build()
}
