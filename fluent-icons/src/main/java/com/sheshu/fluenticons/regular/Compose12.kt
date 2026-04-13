package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Compose12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Compose12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.854f, 1.853f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.706f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineTo(5.293f, 6f)
            lineTo(5f, 7f)
            lineToRelative(1f, -0.293f)
            lineToRelative(4.854f, -4.853f)
            close()
            moveTo(6.5f, 2f)
            curveTo(6.776f, 2f, 7f, 2.224f, 7f, 2.5f)
            reflectiveCurveTo(6.776f, 3f, 6.5f, 3f)
            horizontalLineTo(4f)
            curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(5.5f)
            curveTo(9f, 5.224f, 9.224f, 5f, 9.5f, 5f)
            reflectiveCurveTo(10f, 5.224f, 10f, 5.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(2.5f)
            close()
        }
    }.build()
}
