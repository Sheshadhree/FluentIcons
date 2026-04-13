package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.WindowHeaderHorizontalOff20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WindowHeaderHorizontalOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineTo(3.415f, 4.12f)
            curveTo(3.152f, 4.516f, 3f, 4.991f, 3f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(0.51f, 0f, 0.983f, -0.152f, 1.379f, -0.414f)
            lineToRelative(1.267f, 1.268f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            close()
            moveToRelative(11.906f, 13.32f)
            curveToRelative(-0.083f, 0.021f, -0.17f, 0.033f, -0.259f, 0.033f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(7f)
            horizontalLineToRelative(1.793f)
            lineToRelative(8.466f, 8.466f)
            close()
            moveTo(15.5f, 7f)
            verticalLineToRelative(6.379f)
            lineToRelative(1.475f, 1.475f)
            curveTo(16.991f, 14.738f, 17f, 14.62f, 17f, 14.5f)
            verticalLineToRelative(-9f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            curveTo(5.38f, 3f, 5.262f, 3.009f, 5.146f, 3.025f)
            lineTo(9.121f, 7f)
            horizontalLineTo(15.5f)
            close()
        }
    }.build()
}
