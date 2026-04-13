package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDownRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDownRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 13f)
            curveTo(7.224f, 13f, 7f, 13.224f, 7f, 13.5f)
            reflectiveCurveTo(7.224f, 14f, 7.5f, 14f)
            horizontalLineToRelative(6f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-6f)
            curveTo(14f, 7.224f, 13.776f, 7f, 13.5f, 7f)
            reflectiveCurveTo(13f, 7.224f, 13f, 7.5f)
            verticalLineToRelative(4.793f)
            lineTo(2.854f, 2.147f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineTo(12.293f, 13f)
            horizontalLineTo(7.5f)
            close()
        }
    }.build()
}
