package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FoodToast24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FoodToast24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.25f, 9f)
            curveTo(7.836f, 9f, 7.5f, 9.336f, 7.5f, 9.75f)
            verticalLineToRelative(4.5f)
            curveTo(7.5f, 14.664f, 7.836f, 15f, 8.25f, 15f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-4.5f)
            curveTo(13.5f, 9.336f, 13.164f, 9f, 12.75f, 9f)
            horizontalLineToRelative(-4.5f)
            close()
            moveTo(9f, 13.5f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineTo(9f)
            close()
            moveTo(2f, 7.75f)
            curveTo(2f, 5.127f, 4.127f, 3f, 6.75f, 3f)
            horizontalLineToRelative(10.5f)
            curveTo(19.873f, 3f, 22f, 5.127f, 22f, 7.75f)
            curveToRelative(0f, 1.238f, -0.474f, 2.366f, -1.25f, 3.211f)
            verticalLineToRelative(7.789f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineToRelative(-13f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineToRelative(-7.789f)
            curveTo(2.474f, 10.116f, 2f, 8.988f, 2f, 7.75f)
            close()
            moveTo(6.75f, 4.5f)
            curveTo(4.955f, 4.5f, 3.5f, 5.955f, 3.5f, 7.75f)
            curveToRelative(0f, 0.93f, 0.39f, 1.767f, 1.016f, 2.36f)
            curveToRelative(0.15f, 0.142f, 0.234f, 0.339f, 0.234f, 0.545f)
            verticalLineToRelative(8.095f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(10f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-7.692f)
            curveToRelative(0f, -0.248f, 0.123f, -0.48f, 0.328f, -0.62f)
            curveTo(17.438f, 9.852f, 18f, 8.866f, 18f, 7.75f)
            curveToRelative(0f, -1.795f, -1.455f, -3.25f, -3.25f, -3.25f)
            horizontalLineToRelative(-8f)
            close()
        }
    }.build()
}
