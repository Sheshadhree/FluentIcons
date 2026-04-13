package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoSecurity24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoSecurity24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineToRelative(8.5f)
            curveTo(15.545f, 3f, 17f, 4.455f, 17f, 6.25f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-8.5f)
            curveTo(3.455f, 16f, 2f, 14.545f, 2f, 12.75f)
            verticalLineToRelative(-6.5f)
            close()
            moveToRelative(19.62f, -2.653f)
            curveTo(21.854f, 3.731f, 22f, 3.98f, 22f, 4.25f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.27f, -0.145f, 0.52f, -0.38f, 0.653f)
            curveToRelative(-0.236f, 0.133f, -0.524f, 0.13f, -0.756f, -0.01f)
            lineTo(18f, 13.675f)
            verticalLineToRelative(-8.35f)
            lineToRelative(2.864f, -1.718f)
            curveToRelative(0.232f, -0.14f, 0.52f, -0.143f, 0.755f, -0.01f)
            close()
            moveTo(8.134f, 17f)
            curveToRelative(-0.318f, 1.014f, -1.266f, 1.75f, -2.385f, 1.75f)
            horizontalLineToRelative(-2f)
            curveTo(3.336f, 18.75f, 3f, 19.086f, 3f, 19.5f)
            verticalLineToRelative(1.6f)
            curveTo(3f, 21.597f, 3.403f, 22f, 3.9f, 22f)
            horizontalLineToRelative(1.944f)
            curveToRelative(3.004f, 0f, 5.506f, -2.153f, 6.048f, -5f)
            horizontalLineTo(8.136f)
            close()
        }
    }.build()
}
