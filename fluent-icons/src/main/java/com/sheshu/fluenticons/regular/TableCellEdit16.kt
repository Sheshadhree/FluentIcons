package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableCellEdit16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableCellEdit16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.944f, 5f)
            lineToRelative(-1f, 1f)
            horizontalLineTo(6f)
            verticalLineToRelative(3.982f)
            curveTo(5.766f, 10.286f, 5.588f, 10.632f, 5.476f, 11f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 11f, 2f, 10.328f, 2f, 9.5f)
            verticalLineToRelative(-3f)
            curveTo(2f, 5.672f, 2.672f, 5f, 3.5f, 5f)
            horizontalLineToRelative(7.444f)
            close()
            moveTo(3f, 9.5f)
            curveTo(3f, 9.776f, 3.224f, 10f, 3.5f, 10f)
            horizontalLineTo(5f)
            verticalLineTo(6f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 6f, 3f, 6.224f, 3f, 6.5f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(3.98f, 0.877f)
            lineToRelative(4.83f, -4.83f)
            curveToRelative(0.73f, -0.73f, 1.914f, -0.73f, 2.644f, 0f)
            curveToRelative(0.73f, 0.731f, 0.73f, 1.915f, 0f, 2.646f)
            lineToRelative(-4.83f, 4.829f)
            curveToRelative(-0.281f, 0.282f, -0.634f, 0.481f, -1.02f, 0.578f)
            lineToRelative(-1.498f, 0.374f)
            curveToRelative(-0.651f, 0.163f, -1.242f, -0.427f, -1.079f, -1.078f)
            lineToRelative(0.375f, -1.498f)
            curveToRelative(0.096f, -0.386f, 0.296f, -0.74f, 0.578f, -1.02f)
            close()
        }
    }.build()
}
