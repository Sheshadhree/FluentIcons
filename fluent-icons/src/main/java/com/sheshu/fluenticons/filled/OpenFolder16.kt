package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.OpenFolder16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.OpenFolder16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 5.25f)
            curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
            horizontalLineToRelative(5.5f)
            curveTo(12.545f, 2f, 14f, 3.455f, 14f, 5.25f)
            verticalLineToRelative(2f)
            curveTo(14f, 7.664f, 13.664f, 8f, 13.25f, 8f)
            reflectiveCurveTo(12.5f, 7.664f, 12.5f, 7.25f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineToRelative(-5.5f)
            curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(3f)
            curveTo(8.664f, 12.5f, 9f, 12.836f, 9f, 13.25f)
            reflectiveCurveTo(8.664f, 14f, 8.25f, 14f)
            horizontalLineToRelative(-3f)
            curveTo(3.455f, 14f, 2f, 12.545f, 2f, 10.75f)
            verticalLineToRelative(-5.5f)
            close()
            moveToRelative(4f, 1.5f)
            curveTo(6f, 6.336f, 6.336f, 6f, 6.75f, 6f)
            horizontalLineToRelative(3.5f)
            curveTo(10.664f, 6f, 11f, 6.336f, 11f, 6.75f)
            reflectiveCurveTo(10.664f, 7.5f, 10.25f, 7.5f)
            horizontalLineTo(8.56f)
            lineToRelative(4.22f, 4.22f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineTo(7.5f, 8.56f)
            verticalLineToRelative(1.69f)
            curveTo(7.5f, 10.664f, 7.164f, 11f, 6.75f, 11f)
            reflectiveCurveTo(6f, 10.664f, 6f, 10.25f)
            verticalLineToRelative(-3.5f)
            close()
        }
    }.build()
}
