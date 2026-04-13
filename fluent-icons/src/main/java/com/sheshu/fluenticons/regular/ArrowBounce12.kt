package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowBounce12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowBounce12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 3.5f)
            curveTo(1f, 3.224f, 1.224f, 3f, 1.5f, 3f)
            horizontalLineToRelative(4f)
            curveTo(5.776f, 3f, 6f, 3.224f, 6f, 3.5f)
            reflectiveCurveTo(5.776f, 4f, 5.5f, 4f)
            horizontalLineTo(2.707f)
            lineTo(6.5f, 7.793f)
            lineToRelative(3.646f, -3.647f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-4f, 4f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineTo(2f, 4.707f)
            verticalLineTo(7.5f)
            curveTo(2f, 7.776f, 1.776f, 8f, 1.5f, 8f)
            reflectiveCurveTo(1f, 7.776f, 1f, 7.5f)
            verticalLineToRelative(-4f)
            close()
        }
    }.build()
}
