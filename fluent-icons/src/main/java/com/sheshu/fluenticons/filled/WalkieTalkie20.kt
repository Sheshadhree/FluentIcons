package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WalkieTalkie20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WalkieTalkie20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 7f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(4f)
            verticalLineTo(7f)
            horizontalLineTo(8f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 1f)
            curveTo(7.776f, 1f, 8f, 1.224f, 8f, 1.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(6.5f)
            curveTo(15.328f, 3f, 16f, 3.672f, 16f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.099f, -0.03f, 0.195f, -0.084f, 0.277f)
            lineTo(14f, 14.651f)
            verticalLineTo(16.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveTo(6.672f, 18f, 6f, 17.328f, 6f, 16.5f)
            verticalLineToRelative(-1.849f)
            lineToRelative(-1.916f, -2.874f)
            curveTo(4.029f, 11.695f, 4f, 11.6f, 4f, 11.5f)
            verticalLineToRelative(-7f)
            curveTo(4f, 3.672f, 4.672f, 3f, 5.5f, 3f)
            horizontalLineTo(7f)
            verticalLineTo(1.5f)
            curveTo(7f, 1.224f, 7.224f, 1f, 7.5f, 1f)
            close()
            moveTo(7f, 6.5f)
            verticalLineToRelative(3f)
            curveTo(7f, 9.776f, 7.224f, 10f, 7.5f, 10f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-3f)
            curveTo(13f, 6.224f, 12.776f, 6f, 12.5f, 6f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 6f, 7f, 6.224f, 7f, 6.5f)
            close()
            moveToRelative(1f, 6f)
            curveTo(8f, 12.776f, 8.224f, 13f, 8.5f, 13f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 12f, 11.5f, 12f)
            horizontalLineToRelative(-3f)
            curveTo(8.224f, 12f, 8f, 12.224f, 8f, 12.5f)
            close()
        }
    }.build()
}
