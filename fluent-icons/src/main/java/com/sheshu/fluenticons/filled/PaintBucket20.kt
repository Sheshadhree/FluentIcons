package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PaintBucket20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaintBucket20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 2.5f)
            curveTo(9f, 2.224f, 8.776f, 2f, 8.5f, 2f)
            reflectiveCurveTo(8f, 2.224f, 8f, 2.5f)
            verticalLineTo(4f)
            curveTo(7.795f, 4.072f, 7.603f, 4.19f, 7.44f, 4.354f)
            lineTo(2.352f, 9.439f)
            curveToRelative(-0.585f, 0.586f, -0.585f, 1.536f, 0f, 2.122f)
            lineToRelative(4.336f, 4.335f)
            curveToRelative(0.586f, 0.586f, 1.536f, 0.586f, 2.122f, 0f)
            lineToRelative(5.085f, -5.085f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0f, -2.122f)
            lineTo(9.561f, 4.354f)
            curveTo(9.397f, 4.19f, 9.205f, 4.072f, 9f, 4f)
            verticalLineTo(2.5f)
            close()
            moveToRelative(4.269f, 7.5f)
            horizontalLineTo(3.207f)
            lineTo(8f, 5.207f)
            verticalLineTo(6.5f)
            curveTo(8f, 6.776f, 8.224f, 7f, 8.5f, 7f)
            reflectiveCurveTo(9f, 6.776f, 9f, 6.5f)
            verticalLineTo(5.207f)
            lineToRelative(4.19f, 4.19f)
            curveTo(13.352f, 9.56f, 13.38f, 9.808f, 13.268f, 10f)
            close()
            moveToRelative(2.747f, 1.392f)
            curveToRelative(-0.23f, -0.395f, -0.801f, -0.395f, -1.032f, 0f)
            lineToRelative(-1.652f, 2.833f)
            curveTo(12.355f, 15.898f, 13.562f, 18f, 15.5f, 18f)
            curveToRelative(1.937f, 0f, 3.145f, -2.102f, 2.168f, -3.775f)
            lineToRelative(-1.652f, -2.833f)
            close()
        }
    }.build()
}
