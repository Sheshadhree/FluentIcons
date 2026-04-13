package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpRightDashes16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpRightDashes16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 2f)
            curveTo(7.224f, 2f, 7f, 2.224f, 7f, 2.5f)
            reflectiveCurveTo(7.224f, 3f, 7.5f, 3f)
            horizontalLineToRelative(4.793f)
            lineToRelative(-2.147f, 2.146f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineTo(13f, 3.707f)
            verticalLineTo(8.5f)
            curveTo(13f, 8.776f, 13.224f, 9f, 13.5f, 9f)
            reflectiveCurveTo(14f, 8.776f, 14f, 8.5f)
            verticalLineToRelative(-6f)
            curveTo(14f, 2.224f, 13.776f, 2f, 13.5f, 2f)
            horizontalLineToRelative(-6f)
            close()
            moveToRelative(1.354f, 5.854f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.707f)
            curveToRelative(0.195f, 0.196f, 0.511f, 0.196f, 0.707f, 0f)
            lineToRelative(2f, -2f)
            close()
            moveToRelative(-4f, 4f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(2f, -2f)
            close()
        }
    }.build()
}
