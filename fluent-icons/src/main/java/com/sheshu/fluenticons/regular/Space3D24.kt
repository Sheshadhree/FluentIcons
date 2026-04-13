package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Space3D24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Space3D24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(6.25f, 4.5f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(11f)
            horizontalLineToRelative(15f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineTo(6.25f)
            close()
            moveTo(4.5f, 14.083f)
            lineTo(5.688f, 12.5f)
            horizontalLineTo(4.5f)
            verticalLineToRelative(1.583f)
            close()
            moveTo(5.688f, 15f)
            horizontalLineToRelative(3.289f)
            lineToRelative(0.625f, -2.5f)
            horizontalLineToRelative(-2.04f)
            lineTo(5.689f, 15f)
            close()
            moveTo(4.5f, 16.5f)
            verticalLineToRelative(1.25f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(1.602f)
            lineToRelative(0.75f, -3f)
            horizontalLineTo(4.5f)
            close()
            moveToRelative(5.648f, 0f)
            lineToRelative(-0.75f, 3f)
            horizontalLineToRelative(5.66f)
            lineToRelative(-0.938f, -3f)
            horizontalLineToRelative(-3.972f)
            close()
            moveToRelative(5.544f, 0f)
            lineToRelative(0.938f, 3f)
            horizontalLineToRelative(1.12f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(16.5f)
            horizontalLineToRelative(-3.808f)
            close()
            moveToRelative(2.62f, -1.5f)
            lineToRelative(-1.875f, -2.5f)
            horizontalLineToRelative(-1.995f)
            lineToRelative(0.781f, 2.5f)
            horizontalLineToRelative(3.09f)
            close()
            moveToRelative(-4.66f, 0f)
            lineToRelative(-0.781f, -2.5f)
            horizontalLineToRelative(-1.723f)
            lineTo(10.523f, 15f)
            horizontalLineToRelative(3.129f)
            close()
            moveToRelative(5.848f, -0.917f)
            verticalLineTo(12.5f)
            horizontalLineToRelative(-1.188f)
            lineToRelative(1.188f, 1.583f)
            close()
        }
    }.build()
}
