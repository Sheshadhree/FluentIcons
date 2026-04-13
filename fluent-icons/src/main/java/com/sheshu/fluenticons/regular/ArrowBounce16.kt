package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowBounce16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowBounce16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 4.5f)
            curveTo(8f, 4.224f, 7.776f, 4f, 7.5f, 4f)
            horizontalLineToRelative(-6f)
            curveTo(1.224f, 4f, 1f, 4.224f, 1f, 4.5f)
            verticalLineToRelative(6f)
            curveTo(1f, 10.776f, 1.224f, 11f, 1.5f, 11f)
            reflectiveCurveTo(2f, 10.776f, 2f, 10.5f)
            verticalLineTo(5.707f)
            lineToRelative(6.397f, 6.397f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(5.75f, -5.75f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineTo(8.75f, 11.043f)
            lineTo(2.707f, 5f)
            horizontalLineTo(7.5f)
            curveTo(7.776f, 5f, 8f, 4.776f, 8f, 4.5f)
            close()
        }
    }.build()
}
