package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowNext12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowNext12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.647f, 2.853f)
            curveToRelative(-0.196f, -0.195f, -0.196f, -0.511f, 0f, -0.707f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-3.5f, 3.5f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            lineTo(5.793f, 6f)
            lineTo(2.646f, 2.853f)
            close()
            moveTo(10f, 2.5f)
            curveTo(10f, 2.224f, 9.776f, 2f, 9.5f, 2f)
            reflectiveCurveTo(9f, 2.224f, 9f, 2.5f)
            verticalLineToRelative(7f)
            curveTo(9f, 9.776f, 9.224f, 10f, 9.5f, 10f)
            reflectiveCurveTo(10f, 9.776f, 10f, 9.5f)
            verticalLineToRelative(-7f)
            close()
        }
    }.build()
}
