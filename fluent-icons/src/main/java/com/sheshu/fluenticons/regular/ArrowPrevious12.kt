package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowPrevious12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowPrevious12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.207f, 6f)
            lineToRelative(3.147f, -3.147f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineToRelative(-3.5f, 3.5f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            lineTo(6.207f, 6f)
            close()
            moveTo(3f, 2.5f)
            curveTo(3f, 2.224f, 2.776f, 2f, 2.5f, 2f)
            reflectiveCurveTo(2f, 2.224f, 2f, 2.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 9.776f, 2.224f, 10f, 2.5f, 10f)
            reflectiveCurveTo(3f, 9.776f, 3f, 9.5f)
            verticalLineToRelative(-7f)
            close()
        }
    }.build()
}
