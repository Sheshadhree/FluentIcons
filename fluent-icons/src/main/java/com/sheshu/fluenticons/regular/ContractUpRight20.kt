package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ContractUpRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ContractUpRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineTo(14f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(2.5f)
            curveTo(3f, 8.776f, 3.224f, 9f, 3.5f, 9f)
            reflectiveCurveTo(4f, 8.776f, 4f, 8.5f)
            verticalLineTo(6f)
            close()
            moveToRelative(8f, 3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(4f)
            horizontalLineToRelative(3f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-4f)
            close()
            moveToRelative(-9f, 2.5f)
            curveTo(3f, 11.776f, 3.224f, 12f, 3.5f, 12f)
            horizontalLineToRelative(3.793f)
            lineToRelative(-4.146f, 4.146f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineTo(8f, 12.707f)
            verticalLineTo(16.5f)
            curveTo(8f, 16.776f, 8.224f, 17f, 8.5f, 17f)
            reflectiveCurveTo(9f, 16.776f, 9f, 16.5f)
            verticalLineToRelative(-5f)
            curveTo(9f, 11.224f, 8.776f, 11f, 8.5f, 11f)
            horizontalLineToRelative(-5f)
            curveTo(3.224f, 11f, 3f, 11.224f, 3f, 11.5f)
            close()
        }
    }.build()
}
