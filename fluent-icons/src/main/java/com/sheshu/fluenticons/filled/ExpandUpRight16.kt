package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ExpandUpRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ExpandUpRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 3f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(3.23f)
            curveTo(7.209f, 8f, 8f, 8.792f, 8f, 9.77f)
            verticalLineTo(13f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(9.27f)
            curveToRelative(0f, -0.277f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveTo(14f, 8.992f, 14f, 9.27f)
            verticalLineToRelative(2.23f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(2.23f)
            curveToRelative(0.277f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(7.008f, 3f, 6.73f, 3f)
            horizontalLineTo(4.5f)
            close()
            moveToRelative(4.27f, -0.5f)
            curveToRelative(0f, -0.276f, 0.223f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(4.23f)
            curveTo(13.776f, 2f, 14f, 2.224f, 14f, 2.5f)
            verticalLineToRelative(4.23f)
            curveToRelative(0f, 0.277f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(13f, 7.008f, 13f, 6.73f)
            verticalLineTo(3.708f)
            lineTo(9.623f, 7.084f)
            curveToRelative(-0.195f, 0.196f, -0.512f, 0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.707f)
            lineTo(12.293f, 3f)
            horizontalLineTo(9.27f)
            curveToRelative(-0.277f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            close()
        }
    }.build()
}
