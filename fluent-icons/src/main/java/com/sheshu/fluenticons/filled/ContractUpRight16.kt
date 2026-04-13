package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ContractUpRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ContractUpRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineTo(8f)
            verticalLineToRelative(3.5f)
            curveTo(8f, 7.328f, 8.672f, 8f, 9.5f, 8f)
            horizontalLineTo(13f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2f)
            curveTo(9.224f, 13f, 9f, 13.224f, 9f, 13.5f)
            reflectiveCurveTo(9.224f, 14f, 9.5f, 14f)
            horizontalLineToRelative(2f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(2f)
            curveTo(2f, 6.776f, 2.224f, 7f, 2.5f, 7f)
            reflectiveCurveTo(3f, 6.776f, 3f, 6.5f)
            verticalLineToRelative(-2f)
            close()
            moveToRelative(-1f, 5f)
            curveTo(2f, 9.776f, 2.224f, 10f, 2.5f, 10f)
            horizontalLineToRelative(2.793f)
            lineToRelative(-3.147f, 3.146f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineTo(6f, 10.707f)
            verticalLineTo(13.5f)
            curveTo(6f, 13.776f, 6.224f, 14f, 6.5f, 14f)
            reflectiveCurveTo(7f, 13.776f, 7f, 13.5f)
            verticalLineToRelative(-4f)
            curveTo(7f, 9.224f, 6.776f, 9f, 6.5f, 9f)
            horizontalLineToRelative(-4f)
            curveTo(2.224f, 9f, 2f, 9.224f, 2f, 9.5f)
            close()
        }
    }.build()
}
