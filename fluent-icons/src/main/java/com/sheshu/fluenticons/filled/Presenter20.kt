package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Presenter20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Presenter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.999f, 4f)
            curveToRelative(0f, 1.105f, -0.896f, 2f, -2f, 2f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            curveToRelative(1.104f, 0f, 2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(-5f, 10.784f)
            verticalLineTo(16.5f)
            curveToRelative(0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1.716f)
            curveToRelative(0f, -0.136f, 0.055f, -0.266f, 0.153f, -0.36f)
            lineToRelative(3.703f, -3.564f)
            curveToRelative(0.324f, -0.312f, 0.103f, -0.86f, -0.347f, -0.86f)
            horizontalLineTo(3.49f)
            curveToRelative(-0.45f, 0f, -0.67f, 0.548f, -0.346f, 0.86f)
            lineToRelative(3.702f, 3.564f)
            curveTo(6.943f, 14.518f, 7f, 14.648f, 7f, 14.784f)
            close()
            moveTo(8.499f, 7f)
            curveToRelative(-0.829f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(6f)
            verticalLineTo(8.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
