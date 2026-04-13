package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ContractUpRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ContractUpRight24",
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
            horizontalLineToRelative(-4f)
            curveTo(13.336f, 21f, 13f, 20.664f, 13f, 20.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(4f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(12f)
            horizontalLineToRelative(-5.25f)
            curveTo(13.007f, 12f, 12f, 10.993f, 12f, 9.75f)
            verticalLineTo(4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineToRelative(4f)
            curveTo(4.5f, 10.664f, 4.164f, 11f, 3.75f, 11f)
            reflectiveCurveTo(3f, 10.664f, 3f, 10.25f)
            verticalLineToRelative(-4f)
            close()
            moveToRelative(0.75f, 8.25f)
            curveTo(3.336f, 14.5f, 3f, 14.164f, 3f, 13.75f)
            reflectiveCurveTo(3.336f, 13f, 3.75f, 13f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(9.5f, 20.664f, 9.5f, 20.25f)
            verticalLineToRelative(-4.69f)
            lineToRelative(-5.22f, 5.22f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(5.22f, -5.22f)
            horizontalLineTo(3.75f)
            close()
        }
    }.build()
}
