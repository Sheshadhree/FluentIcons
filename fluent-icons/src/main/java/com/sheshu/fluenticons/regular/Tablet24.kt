package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Tablet24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Tablet24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.749f, 4f)
            curveToRelative(1.242f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(11.502f)
            curveToRelative(0f, 1.243f, -1.008f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(4.25f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineTo(6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineToRelative(15.499f)
            close()
            moveToRelative(0f, 1.5f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 5.5f, 3.5f, 5.836f, 3.5f, 6.25f)
            verticalLineToRelative(11.502f)
            curveToRelative(0f, 0.415f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(15.499f)
            curveToRelative(0.414f, 0f, 0.75f, -0.335f, 0.75f, -0.75f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            close()
            moveToRelative(-9.499f, 10f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.744f)
            lineTo(13.75f, 17f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.335f, -0.75f, -0.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.693f, 0.648f, -0.743f)
            lineTo(10.25f, 15.5f)
            horizontalLineToRelative(3.5f)
            horizontalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
