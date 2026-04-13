package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShareScreenPersonOverlay24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareScreenPersonOverlay24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineToRelative(13.5f)
            curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
            verticalLineToRelative(7.25f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveTo(15f, 12.567f, 15f, 14.5f)
            curveToRelative(0f, 0.98f, 0.402f, 1.865f, 1.05f, 2.5f)
            horizontalLineToRelative(-0.277f)
            curveTo(14.242f, 17f, 13f, 18.24f, 13f, 19.772f)
            verticalLineToRelative(0.103f)
            curveToRelative(0f, 0.042f, 0f, 0.083f, 0.002f, 0.125f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
            verticalLineToRelative(-9.5f)
            close()
            moveTo(5f, 8f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(6f)
            curveTo(5.448f, 7f, 5f, 7.448f, 5f, 8f)
            close()
            moveToRelative(16f, 6.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveTo(16f, 15.88f, 16f, 14.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveToRelative(2f, 5.375f)
            curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
            reflectiveCurveTo(14f, 21.437f, 14f, 19.875f)
            verticalLineToRelative(-0.103f)
            curveTo(14f, 18.792f, 14.794f, 18f, 15.773f, 18f)
            horizontalLineToRelative(5.454f)
            curveTo(22.207f, 18f, 23f, 18.793f, 23f, 19.772f)
            verticalLineToRelative(0.103f)
            close()
        }
    }.build()
}
