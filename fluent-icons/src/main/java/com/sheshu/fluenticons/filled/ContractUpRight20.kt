package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ContractUpRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ContractUpRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 4f)
            curveTo(4.895f, 4f, 4f, 4.895f, 4f, 6f)
            verticalLineToRelative(2.5f)
            curveTo(4f, 8.776f, 3.776f, 9f, 3.5f, 9f)
            reflectiveCurveTo(3f, 8.776f, 3f, 8.5f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineTo(14f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            horizontalLineTo(6f)
            close()
            moveToRelative(-2.5f, 8f)
            curveTo(3.224f, 12f, 3f, 11.776f, 3f, 11.5f)
            reflectiveCurveTo(3.224f, 11f, 3.5f, 11f)
            horizontalLineToRelative(5f)
            curveTo(8.776f, 11f, 9f, 11.224f, 9f, 11.5f)
            verticalLineToRelative(5f)
            curveTo(9f, 16.776f, 8.776f, 17f, 8.5f, 17f)
            reflectiveCurveTo(8f, 16.776f, 8f, 16.5f)
            verticalLineToRelative(-3.793f)
            lineToRelative(-4.146f, 4.147f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(7.293f, 12f)
            horizontalLineTo(3.5f)
            close()
        }
    }.build()
}
