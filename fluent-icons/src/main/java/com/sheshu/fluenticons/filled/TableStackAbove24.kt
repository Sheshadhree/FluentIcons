package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableStackAbove24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackAbove24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.25f, 4.5f)
            curveTo(20.664f, 4.5f, 21f, 4.164f, 21f, 3.75f)
            reflectiveCurveTo(20.664f, 3f, 20.25f, 3f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
            reflectiveCurveTo(3.336f, 4.5f, 3.75f, 4.5f)
            horizontalLineToRelative(16.5f)
            close()
            moveToRelative(-5.75f, 5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(5f)
            close()
            moveToRelative(-5f, 6.5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(8f, 9.5f)
            verticalLineToRelative(5f)
            horizontalLineTo(3f)
            verticalLineToRelative(-4.25f)
            curveTo(3f, 9.836f, 3.336f, 9.5f, 3.75f, 9.5f)
            horizontalLineTo(8f)
            close()
            moveTo(8f, 16f)
            horizontalLineTo(3f)
            verticalLineToRelative(1.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(8f)
            verticalLineToRelative(-5f)
            close()
            moveToRelative(13f, 0f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(1.75f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(16f)
            close()
            moveToRelative(-5f, -1.5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-4.25f)
            curveToRelative(0f, -0.199f, -0.079f, -0.39f, -0.22f, -0.53f)
            curveToRelative(-0.14f, -0.141f, -0.331f, -0.22f, -0.53f, -0.22f)
            horizontalLineTo(16f)
            verticalLineToRelative(5f)
            close()
        }
    }.build()
}
