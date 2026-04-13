package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ImageBorder24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageBorder24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 9f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            close()
            moveTo(7.25f, 6.5f)
            curveTo(6.836f, 6.5f, 6.5f, 6.836f, 6.5f, 7.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(9.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-9.5f)
            close()
            moveToRelative(3.159f, 6.159f)
            lineTo(8f, 15.068f)
            verticalLineTo(8f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(7.068f)
            lineToRelative(-2.409f, -2.409f)
            curveToRelative(-0.879f, -0.879f, -2.303f, -0.879f, -3.182f, 0f)
            close()
            moveToRelative(2.121f, 1.06f)
            lineTo(14.81f, 16f)
            horizontalLineTo(9.19f)
            lineToRelative(2.28f, -2.28f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            close()
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(4.5f, 6.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(6.25f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineTo(6.25f)
            close()
        }
    }.build()
}
