package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDownRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDownRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 16f)
            curveTo(8.224f, 16f, 8f, 16.224f, 8f, 16.5f)
            reflectiveCurveTo(8.224f, 17f, 8.5f, 17f)
            horizontalLineToRelative(8f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-8f)
            curveTo(17f, 8.224f, 16.776f, 8f, 16.5f, 8f)
            reflectiveCurveTo(16f, 8.224f, 16f, 8.5f)
            verticalLineToRelative(6.793f)
            lineTo(3.854f, 3.147f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineTo(15.293f, 16f)
            horizontalLineTo(8.5f)
            close()
        }
    }.build()
}
