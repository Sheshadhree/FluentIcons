package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowBounce20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowBounce20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 6f)
            curveTo(2.224f, 6f, 2f, 6.224f, 2f, 6.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 13.776f, 2.224f, 14f, 2.5f, 14f)
            reflectiveCurveTo(3f, 13.776f, 3f, 13.5f)
            verticalLineTo(7.707f)
            lineToRelative(7.146f, 7.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(7f, -7f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(10.5f, 13.793f)
            lineTo(3.707f, 7f)
            horizontalLineTo(9.5f)
            curveTo(9.776f, 7f, 10f, 6.776f, 10f, 6.5f)
            reflectiveCurveTo(9.776f, 6f, 9.5f, 6f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
