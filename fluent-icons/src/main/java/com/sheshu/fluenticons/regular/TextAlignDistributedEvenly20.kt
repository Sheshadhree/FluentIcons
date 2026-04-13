package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAlignDistributedEvenly20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAlignDistributedEvenly20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.5f)
            curveTo(2f, 3.224f, 2.224f, 3f, 2.5f, 3f)
            horizontalLineToRelative(15f)
            curveTo(17.776f, 3f, 18f, 3.224f, 18f, 3.5f)
            reflectiveCurveTo(17.776f, 4f, 17.5f, 4f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 4f, 2f, 3.776f, 2f, 3.5f)
            close()
            moveToRelative(0f, 5f)
            curveTo(2f, 8.224f, 2.224f, 8f, 2.5f, 8f)
            horizontalLineToRelative(15f)
            curveTo(17.776f, 8f, 18f, 8.224f, 18f, 8.5f)
            reflectiveCurveTo(17.776f, 9f, 17.5f, 9f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 9f, 2f, 8.776f, 2f, 8.5f)
            close()
            moveTo(3.707f, 15f)
            horizontalLineToRelative(12.586f)
            lineToRelative(-1.147f, 1.146f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(2f, -2f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(16.293f, 14f)
            horizontalLineTo(3.707f)
            lineToRelative(1.147f, -1.146f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2f, 2f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(3.707f, 15f)
            close()
        }
    }.build()
}
